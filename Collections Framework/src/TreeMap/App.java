package TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{

    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo)
    {
        super();
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo()
    {
        return sectionNo;
    }

    public String getLectureNo()
    {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code [sectionNo : "+sectionNo+" , lectureNo : "+lectureNo+"]";
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo() + o.getLectureNo();
        return code1.compareTo(code2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
        result = prime*result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (this == null)
            return false;
        if (getClass() != obj.getClass())
            return  false;
        Code other = (Code) obj;
        if (lectureNo == null){
            if (other.lectureNo != null)
                return false;
        }
        else if (!lectureNo.equals(other.lectureNo))
            return false;
        if (sectionNo == null){
            if (other.sectionNo != null)
                return false;
        }else if (!sectionNo.equals(other.sectionNo))
            return false;
        return true;
    }
}

public class App {

    public static void main(String[] args) {
        Map<Code, String> list = new TreeMap<Code, String>();
        list.put(new Code("S01","L03"),"Generics");
        list.put(new Code("S01", "L01"), "Files under Java");
        list.put(new Code("S01", "L02"), "Network programming");
        list.put(new Code("S02","L04"), "Methods");
        list.put(new Code("S01", "L02"), "Expression");

        for(Map.Entry<Code, String> entry:list.entrySet())
            System.out.println("Lecture No : "+entry.getKey()+" and lecture content : "+entry.getValue());

        String name1 = new String("Vini");
        String name2 = new String("Vini");
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name1.equals(name2));

        Code code1 = new Code("s0","l01");
        Code code2 = new Code("s0","l01");
        System.out.println("Code 1 hascode : "+code1.hashCode());
        System.out.println("Code 2 hascode : "+code2.hashCode());
        System.out.println(code1.equals(code2));
    }
}
