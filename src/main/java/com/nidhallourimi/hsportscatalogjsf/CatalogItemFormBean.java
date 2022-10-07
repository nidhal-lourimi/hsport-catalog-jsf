package com.nidhallourimi.hsportscatalogjsf;



import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//scop this bean exists for  the request
@RequestScoped
//bean name
@Named
public class CatalogItemFormBean {

    private String name;
    private String manufacturer;
    private String sky;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }
}
