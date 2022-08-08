/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

/**
 *
 * @author Jose Ignacio
 */
import com.tienda.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    public List<Articulo> getArticulos(boolean activo);
    
    public Articulo getArticulo(Articulo articulo);
    
    public void save(Articulo articulo);
    
    public void delete(Articulo articulo);
   
}
