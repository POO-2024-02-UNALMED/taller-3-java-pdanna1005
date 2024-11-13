package taller3.televisores;

public class Control {
    TV tv;

    public void turnOn() {
        tv.estado = true;
    }

    public void turnOff() {
        tv.estado = false;
    }

    public void canalUp() {
        if (tv.estado == true) {
            if (tv.canal < 120) {
                tv.canal++;
            }
        }
        return;
    }

    public void canalDown() {
        if (tv.estado == true) {
            if (tv.canal > 1) {
                tv.canal--;
            }
        }
        return; 
    }

    public void volumenUp() {
        if (tv.estado == true) {
            if (tv.volumen < 7) {
                tv.volumen++;
            }
        } 
        return;
    }

    public void volumenDown() {
        if (tv.estado == true) {
            if (tv.volumen > 0) {
                tv.volumen--;
            }
        } 
        return;
    }

    public void setCanal(int canal) {
        tv.canal = canal;
    }

    public void setVolumen(int volumen) {
        tv.volumen = volumen;
    }

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
