package taller3.televisores;

public class TV {
    private Marca marca;
    public int canal = 1;
    private int precio = 500;
    public boolean estado;
    public int volumen = 1;
    private Control control;
    public static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void setCanal(int newCanal) {
        if (this.estado == true){
            if (this.canal < 120 && this.canal > 1) {
                this.canal = newCanal;
            }
        }
    }

    public void setControl(Control newControl) {
        this.control = newControl;
    }

    public void setMarca(Marca newMarca) {
        this.marca = newMarca;
    }

    public void setPrecio(int newPrecio) {
        this.precio = newPrecio;
    }

    public void setVolumen(int newVolumen) {
        if (this.estado == true){
            if (this.volumen < 7 && this.volumen > 0) {
                this.volumen = newVolumen;
            }
        }
    }

    public int getCanal() {
        return this.canal;
    }

    public Control getControl() {
        return this.control;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public int getPrecio() {
        return this.precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public static void setNumTV(int newNumTV) {
        numTV = newNumTV;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void canalUp() {
        if (estado == true) {
            if (canal < 120) {
                canal = canal + 1;
            }
        }
        return;
    }

    public void canalDown() {
        if (estado == true) {
            if (canal > 1) {
                canal = canal - 1;
            }
        }
        return; 
    }

    public void volumenUp() {
        if (estado == true) {
            if (volumen < 7) {
                volumen = volumen + 1;
            }
        } 
        return;
    }

    public void volumenDown() {
        if (estado == true) {
            if (volumen > 0) {
                volumen = volumen - 1;
            }
        } 
        return;
    }

}
