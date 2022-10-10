package com.nidhallourimi.hsportscatalogjsf;



import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//information pressist acroos http request for particular user
@SessionScoped
//scop this bean exists for  the request
//@RequestScoped
//bean name
@Named
public class CatalogItemFormBean implements Serializable {

    private CatalogItem item=new CatalogItem();

    private List<CatalogItem> items=new ArrayList<>();
    public String addItem(){
        long itemId=  this.items.size()+1;
        this.items.add(new CatalogItem(itemId,this.item.getName(),this.item.getManufacturer(),this.item.getDescription()
                ,this.item.getAvailableDate()));
        this.items.stream().forEach(item->{
            System.out.println(item.toString());
        });
        return "list?faces-redirect=true";
        //navigation preformed via a redirect
    }

    public CatalogItem getItem() {
        return item;
    }

    public void setItem(CatalogItem item) {
        this.item = item;
    }

    public List<CatalogItem> getItems() {
        return items;
    }

    public void setItems(List<CatalogItem> items) {
        this.items = items;
    }
/*    private String name;
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
    }*/
}
