/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.Serializable;

/**
 *
 * @author arissetyawan
 */
public class Product implements Serializable {
    protected String name;
    protected Integer price;
    protected Integer stock;
    protected Integer total;
    protected Double diskon;
    protected Double akhir;
    private Integer quantity;
    private Double a;

    Product(String name, Integer stock, Integer price)
    {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    protected String info(){
        return "Name: " + this.name +", Price: " + this.price +", QTY: " + 
                this.quantity + ", Total: " + this.total + " - " +this.diskon+" = "+this.akhir+ ", Stock: " + this.stock;
    }

    protected Integer buy(Integer quantity)
    {
        a = 0.1;
        this.quantity = quantity;
        this.total = quantity * this.price;
        this.diskon = this.total * a;
        this.akhir = this.total - this.diskon;
        this.stock -= quantity;
        return this.total;
    }
    
    protected Integer getTotal()
    {
        return this.total;
    }
}
