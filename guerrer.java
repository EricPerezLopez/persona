public class guerrer extends chara {
    protected long def;
    public guerrer() {
        this.nom = "berith";
        this.level = 0;
        this.atk = 5;
        this.def = 3;
        this.resist = "f";
        this.weak = "i";
        this.element = "f";
    }

    public guerrer(String n, int a, long hp, String e, String w, String abs, String nu,long df){
        this.nom = n;
        this.atk = a;
        this.maxhp = hp;
        this.weak = w;
        this.element = e;
        this.absorb = abs;
        this.nullify = nu;
        this.def = df;
        this.hp = maxhp;
    }
    public void atacar(long atk, String e) {
    long tdef = def / 100;
    if (e == this.resist) {
        this.hp = this.hp - (Math.round(atk*0.40)*tdef) ;
        System.out.println("RESISTIDO -" + Math.round(atk*0.40) + "hp");
    }
    if (e == this.weak) {
        this.hp = this.hp - (Math.round(atk*1.20)*tdef);
        System.out.println("DEBIL -" +Math.round(atk*1.20)+ "hp");
    }
    if (e == this.absorb) {
        this.hp = this.hp + (Math.round(atk*0.70)*tdef);
        System.out.println("ABSORBIDO"+ Math.round(atk*0.70)+"HP");
    }
    if (e == this.nullify) {
        System.out.println("NULLIFICADO");
    }
    this.statuscheck();
    }

   
}