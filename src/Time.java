
import java.text.SimpleDateFormat;
import java.util.*;


public class Time{
    public static void main(String[] args) {
       String[]ids= TimeZone.getAvailableIDs();
        System.out.println("Available timezones are ");
        for (String id:ids)
        {
          System.out.println(" "+id);
        }

        String format="dd-M-yyyy  hh:mm:ss a";
        SimpleDateFormat dateFormat=new SimpleDateFormat(format);

        Date dt=new Date();
        String defaultTZ= TimeZone.getDefault().getID();

        Calendar cal =new GregorianCalendar();
        cal.setTime(dt);

        System.out.println("Date: "+dateFormat.format(cal.getTime()));
        System.out.println("Timezone: "+cal.getTimeZone().getID());
        System.out.println("Timezone name:"+cal.getTimeZone().getDisplayName());

        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the time zone in which you have to convert local time zone :");
        name=sc.next();

        TimeZone jnbTZ=TimeZone.getTimeZone(name);
        SimpleDateFormat jnbFormat=new SimpleDateFormat(format);
        jnbFormat.setTimeZone(jnbTZ);
        cal.setTimeZone(jnbTZ);

        System.out.println("After conversion");
        System.out.println("Date: "+jnbFormat.format(cal.getTime()));
        System.out.println("Timezone: "+cal.getTimeZone().getID());
        System.out.println("Timezone name:"+cal.getTimeZone().getDisplayName());
        }
}