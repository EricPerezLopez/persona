public class chara {
protected boolean dead;
protected String nom;
protected int level;
protected long hp;
protected long maxhp;
protected long atk;
protected String element;
protected String weak;
protected String resist;
protected String absorb;
protected String nullify;
protected int id;
protected int target;

 public void atacar(long atk, String e) {
    if (e == this.resist) {
        this.hp = this.hp - Math.round(atk*0.40);
        System.out.println("RESISTIDO -" + Math.round(atk*0.40) + "hp");
    }
    if (e == this.weak) {
        this.hp = this.hp - Math.round(atk*1.20);
        System.out.println("DEBIL -" +Math.round(atk*1.20)+ "hp");
    }
    if (e == this.absorb) {
        this.hp = this.hp + Math.round(atk*0.70);
        System.out.println("ABSORBIDO"+ Math.round(atk*0.70)+"HP");
    }
    if (e == this.nullify) {
        System.out.println("NULLIFICADO");
    }
    this.statuscheck();
    }
    public void statuscheck(){
        if (hp <= 0){
            System.out.println(this.nom + "esta muerto");
            this.dead = true;
        }
        if (hp >= maxhp) {
            hp = maxhp;
        }
    }
}
