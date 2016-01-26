public class ComboLock
{
   private int secret1;
   private int secret2;
   private int secret3;
   private boolean willUnlock;
   private boolean isOpen;
   private int dial;
   private int turns;
   public ComboLock( int secret1, int secret2, int secret3 ) 
   { 
       this.secret1=secret1;
       this.secret2=secret2;
       this.secret3=secret3;
       this.isOpen=false;
       this.dial=0;
       this.turns=0;
       this.willUnlock=false;
    }
   public void reset() 
   { 
       this.dial=0;
       this.turns=0;
    }
   public void turnLeft( int ticks ) 
   { 
       this.dial+=ticks;
       if (this.dial>39)
       {
           this.dial-=40;
        }
       if (this.turns==1&&this.dial==secret2)
       {
           this.willUnlock=true;
        }
        else
        {
            this.willUnlock=false;
        }
        this.turns++;
    }
   public void turnRight( int ticks ) 
   { 
       this.dial-=ticks;
       if (this.dial<0)
       {
           this.dial+=40;
        }
       if ((this.turns==0&&this.dial==secret1)||(this.turns==2&&this.dial==secret3))
       {
           this.willUnlock=true;
        }
        else
        {
            this.willUnlock=false;
        }
        this.turns++;
    }
   public boolean open() 
   {
       if (this.willUnlock==true && this.turns==3)
       {
           this.isOpen=true;
        }
       return isOpen;
    }
}