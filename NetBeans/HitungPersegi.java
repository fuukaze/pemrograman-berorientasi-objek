/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungkramik;

/**
 *
 * @author My MSI
 */
public class HitungPersegi extends HitungKramik{
    public int Luas(){
        return getPanjang()*getPanjang();
    }
    public int HitungJmlKramik(int jmlKramikLantai){
        return Luas() * jmlKramikLantai;   
    }
    public int HitungJmlKramik(int jmlKramikLantai, int jmlKramikTembok){
        return Luas() * jmlKramikLantai+Luas()* jmlKramikTembok;   
    }
    public int HitungJmlKramik(int jmlKramikLantai, int jmlKramikTembok,int jmlKramikLantaiLuar){
        return Luas() * jmlKramikLantai+Luas()* jmlKramikTembok+Luas()* jmlKramikLantaiLuar;   
    }
    
}
