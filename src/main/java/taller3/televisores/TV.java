package taller3.televisores;

public class TV {
    private Marca marca;
    protected int canal;
    private int precio;
    protected boolean estado;
    protected int volumen;
    private Control control;
    static int numTv;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        volumen = 1;
        precio = 500;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getCanal() {
        return canal;
    }

    public Control getControl() {
        return control;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public static void setNumTv(int numTv) {
        TV.numTv = numTv;
    }

    public static int getNumTv() {
        return numTv;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (estado == true) {
            if (canal < 120) {
                canal++;
            }
        }
        return;
    }

    public void canalDown() {
        if (estado == true) {
            if (canal > 1) {
                canal--;
            }
        }
        return; 
    }

    public void volumenUp() {
        if (estado == true) {
            if (volumen < 7) {
                volumen++;
            }
        } 
        return;
    }

    public void volumenDown() {
        if (estado == true) {
            if (volumen > 0) {
                volumen--;
            }
        } 
        return;
    }

}
