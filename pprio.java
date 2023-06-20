import javax.swing.JOptionPane;
public class pprio
{
 public static void main(String args[])
 {
  //System.out.println("Preemtive Priority (P-Prio) Scheduling Program");
  JOptionPane.showMessageDialog(null,"Preemtive Priority Scheduling Algorithm","Welcome",JOptionPane.INFORMATION_MESSAGE);


  int i;			//index
  int x;			//no of process
  int at[] = new int[99];	//arrival time
  int bt[] = new int[99];	//burst time
  int p[] = new int[99];	//priority
  int wt[] = new int[99];
  int tt[] = new int[99];
  String table = new String("");
  String gantt = new String("");
  String wait = new String("");
  String turn = new String("");


  x=Integer.parseInt(JOptionPane.showInputDialog("How many processes?"));
  for(i=1;i<=x;i++)
  {
   at[i]=Integer.parseInt(JOptionPane.showInputDialog("Input arrival time of P"+i+":"));
  }
  for(i=1;i<=x;i++)
  {
   bt[i]=Integer.parseInt(JOptionPane.showInputDialog("Input burst time of P"+i+":"));
  }
  for(i=1;i<=x;i++)
  {
   p[i]=Integer.parseInt(JOptionPane.showInputDialog("Input priority of P"+i+":"));
  }
  for(i=1;i<=x;i++)
  {
   table=table+"|P"+i+((i<10)?"                  |":"                |")+at[i]+((at[i]<10)?"                    |":"                  |")+bt[i]+((bt[i]<10)?"                     |":"                  |")+p[i]+((p[i]<10)?"                 |\n":"               |\n")+"|-----------------|-----------------|-----------------|---------------|\n";
  }
  table="|-----------------|-----------------|-----------------|---------------|\n"+"|Process       |Arrival Time|Burst Time  |Priority      |\n"+"|-----------------|-----------------|-----------------|---------------|\n"+table;




  JOptionPane.showMessageDialog(null,table,"Table",JOptionPane.PLAIN_MESSAGE);
  JOptionPane.showMessageDialog(null,"","Gantt Chart",JOptionPane.PLAIN_MESSAGE);
  JOptionPane.showMessageDialog(null,"","Waiting Time",JOptionPane.PLAIN_MESSAGE);
  JOptionPane.showMessageDialog(null,"","Turnaround Time",JOptionPane.PLAIN_MESSAGE);
  JOptionPane.showMessageDialog(null,"","Sayonara",JOptionPane.WARNING_MESSAGE);
  System.exit(0);
 }
}