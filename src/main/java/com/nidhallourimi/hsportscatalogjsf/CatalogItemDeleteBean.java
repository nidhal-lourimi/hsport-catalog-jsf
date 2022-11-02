package com.nidhallourimi.hsportscatalogjsf;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class CatalogItemDeleteBean {
    private  Long itemId;
    private CatalogItem item;

    @Inject
    private CatalogItemFormBean catalogItemFormBean;
}
