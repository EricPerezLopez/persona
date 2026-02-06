public class mag extends chara{
     protected long sp;
public mag(String n, int a, long hp, String e, String w, String abs, String nu,long mana){
        this.nom = n;
        this.atk = a;
        this.maxhp = hp;
        this.weak = w;
        this.element = e;
        this.absorb = abs;
        this.nullify = nu;
        this.hp = maxhp;
        this.sp = mana;
    }
}
