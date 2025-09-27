public class Game {
    public int getIndiquateur() {
        return indiquateur;
    }

    private int[][] Tab;
    private int indiquateur;
    public Game(int indique)
    {
    
        this.Tab=new int[3][3];
        if(indique==1 || indique==2)
        {
            this.indiquateur=indique;
        }
    }
    public void jouer(int x,int y)
    {
        if(this.indiquateur==1)
        {
            if(Tab[x][y]==0)
            {
                //System.out.println("Joue 1");
                this.Tab[x][y]=this.indiquateur;
                this.indiquateur=2;
                if(this.gagner())
                {
                    System.out.println("Le gagant est le 1");
                }
            }
            else
            {
                System.out.println("Case invalide:");
            }
        }
        else
        {
            if(Tab[x][y]==0)
            {
                //System.out.println("Joue 2");
                this.Tab[x][y]=this.indiquateur;
                this.indiquateur=1;
                if(this.gagner())
                {
                    System.out.println("Le gagant est le 2");
                }
                if(this.matchNull())
                {
                    System.out.println("Match null");
                }
            }
            else
            {
                System.out.println("Case invalide:");
            }
        }
    }

        public boolean gagner()
        {
            boolean B=false;
            for(int i=0;i<3;++i)
            {
               
                if(Tab[i][0]==this.indiquateur &&Tab[i][1]==this.indiquateur && Tab[i][2]==this.indiquateur) 
                {
                    B=true;
                    break;
                }
               
                else if(Tab[0][i]==this.indiquateur &&Tab[1][i]==this.indiquateur && Tab[2][i]==this.indiquateur) 
                {
                    B=true;
                    break;
                }
                  
            }
            if(Tab[0][0]==this.indiquateur &&Tab[1][1]==this.indiquateur && Tab[2][2]==this.indiquateur)
           {
                B=true;
           }
           if(Tab[0][2]==this.indiquateur &&Tab[1][1]==this.indiquateur && Tab[2][0]==this.indiquateur)
           {
                B=true;
           }
           return B;
        }
        public boolean matchNull()
        {

            boolean N=false;
            for(int i=0;i<3;++i)
            {
                for(int j=0;j<3;++j)
                {
                    if(Tab[i][j]!=0)
                    {
                        N=true;
                    }
                    else{
                        return false;
                    }
                }
            }
            return N;
        }
       /*  public String message()
        {
            return "Le gagant est ";
        }*/
    }
