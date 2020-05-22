package cl.tbd.ejemplo1.models;

public class Institucion{
    private Long id;
    private String nombre;
    private String descrip;


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    } 

    public String getDescrip(){
        return this.descrip;
    }

    public void setDescrip(String descrip){
        this.descrip = descrip;
    }  
}
