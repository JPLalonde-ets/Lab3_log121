package model;

public class Perspective extends Subject {
    private double sx, sy, tx, ty;

    public double getSx() {
        return sx;
    }

    public void setSx(double sx) {
        this.sx = sx;
        notifyObservers();
    }

    public double getSy() {
        return sy;
    }

    public void setSy(double sy) {
        this.sy = sy;
        notifyObservers();
    }

    public double getTx() {
        return tx;
    }

    public void setTx(double tx) {
        this.tx = tx;
        notifyObservers();
    }

    public double getTy() {
        return ty;
    }

    public void setTy(double ty) {
        this.ty = ty;
        notifyObservers();
    }

    public void setScale(double sx, double sy) {
        this.sx = sx;
        this.sy = sy;
        notifyObservers();
    }

    public void setTranslation(double tx, double ty) {
        this.tx = tx;
        this.ty = ty;
        notifyObservers();
    }

    public MementoPerspective saveState(){
        return new MementoPerspective(sx, sy, tx, ty);
    }

    public void restoreState(MementoPerspective state) {
        tx = state.getTx();
        ty = state.getTy();
        sx = state.getSx();
        sy = state.getSy();
        notifyObservers();
    }

    public Perspective() {
    }

    public Perspective(double sx, double sy, double tx, double ty) {
        this.sx = sx;
        this.sy = sy;
        this.tx = tx;
        this.ty = ty;
    }
}
