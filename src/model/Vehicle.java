package model;

public abstract class Vehicle {
    
    private double basePrice;
    private double sellPrice;
    private String brand;
    private int model;
    private int cylinderCapacity;
    private int klm;
    private OwnershipCard ownershipCard;
    private String plate;
    private Status theStatus;
    private SOAT theSoat;
    private Tecnomechanics theTecnomechanics;

    public Vehicle(double basePrice, String brand, int model, int cylinderCapacity, int klm, OwnershipCard ownershipCard, String plate, int statusOption, SOAT theSoat, Tecnomechanics theTecnomechanics){
        this.basePrice=basePrice;
        this.brand=brand;
        this.model=model;
        this.cylinderCapacity=cylinderCapacity;
        this.klm=klm;
        this.ownershipCard=ownershipCard;
        this.plate=plate;
        theStatus=null;
        if(statusOption==1){
            theStatus=theStatus.NUEVO;
        }else if(statusOption==2){
            theStatus=theStatus.USADO;
        }
        this.theSoat = theSoat;
        this.theTecnomechanics = theTecnomechanics;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return this.model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getCylinderCapacity() {
        return this.cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getKlm() {
        return this.klm;
    }

    public void setKlm(int klm) {
        this.klm = klm;
    }

    public Status getTheStatus() {
        return this.theStatus;
    }

    public void setTheStatus(Status theStatus) {
        this.theStatus = theStatus;
    }

    public String toString(){
        String owCard = "";
        String soat = "";
        String tecno = "";
        if(ownershipCard==null){
            owCard = "No aplica";
        }else{
            owCard = ownershipCard.toString();
        }
        if(theSoat==null){
            soat = "No aplica";
        }else{
            soat = theSoat.toString();
        }
        if(theTecnomechanics==null){
            tecno = "No aplica";
        }else{
            tecno = theTecnomechanics.toString();
        }
        return "\nPrecio base: " + basePrice + "\n" +
        "Precio de venta: " + sellPrice + "\n" +
        "Marca: " + brand + "\n" +
        "Año del modelo: " + model + "\n" +
        "cilindraje: " + cylinderCapacity + "\n" +
        "kilometraje: " + klm + "\n" +
        "Placa: " + plate + "\n" +
        "Estado: " + theStatus + "\n" +
        "Tarjeta de propiedad:\n" + owCard + "\n" + 
        "SOAT:\n" + soat + "\n" +
        "Tecnomecanica:\n" + tecno + "\n";
    }
}
