package StudyForJava.front0808.day0904;

public class Ex8ForFor {
    
    public static void main(String[] args) {
        
        // 다중 for문
        for(int i=1;i<=3;i++)
        {
            System.out.println("for 1 구간"+i);
                for(int j=1;j<=4;j++)
                {
                    System.out.println("for 2 구간"+i);
                }
            System.out.println("---------------------");
        }
        System.out.println("===========================");

        for(int i=1;i<=3;i++)
        {
            System.out.println("for 1 구간"+i);
                for(int j=1;j<=4;j++)
                {
                    System.out.println("\tfor 2 구간"+j);
                        if(j==3)
                            break; // 가장 가까운 반복문을 빠져나감
                }
                System.out.println("---------------------")
        }
        System.out.println("===========================");

        Exit:
            for(int i=1;i<=3;i++)
            {
                System.out.println("for 1 구간"+i);
                    for(int j=1;j<=4;j++)
                    {
                        System.out.println("\tfor 2 구간");
                        if(j==3)
                            break Exit; // 바깥쪽 for 문을 빠져나간다
                    }
            }
    }
}