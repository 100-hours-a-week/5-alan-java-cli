package mbti;

public class BestAndWorse extends RankOfMBTI{



    public BestAndWorse(String name,int age,String info,char sex,int ageGapUp,int ageGapDown){
        super(name,age,info,sex,ageGapUp,ageGapDown);
    }




    public void findInfo(String best,String worse){
        switch(best) {
            case "ISTJ":
                System.out.println(" ISTJ는 현실적이고 실용적이며 계획을 잘 세우는 성향을 가지고 있습니다.\n ESFP는 외향적이고 활기차며 즉흥적인 성향을 가지고 있어, 서로의 부족한 부분을 보완해줄 수 있습니다. \nISTJ의 안정성과 계획성은 ESFP의 에너지와 즐거움을 증대시키고, 반대로 ESFP는 ISTJ에게 더 많은 유연성과 즐거움을 줄 수 있습니다.");
                break;
            case "ISFJ":
                System.out.println("ISFJ는 세심하고 헌신적인 성향을 가지고 있으며, ESFP는 활기차고 사교적입니다.\n ISFJ는 ESFP의 활력을 유지하는 데 도움을 줄 수 있고, ESFP는 ISFJ에게 더 많은 사회적 기회를 제공하여 삶을 더 즐겁게 만들 수 있습니다. 서로의 필요를 잘 이해하고 상호 보완적인 관계를 형성할 수 있습니다.");
                break;
            case "INFJ":
                System.out.println(" INFJ는 깊은 감정적 유대와 의미 있는 관계를 중요시하는 반면, ESTP는 실용적이고 즉각적인 경험을 선호합니다.\n ESTP의 현실적이고 행동 지향적인 성향은 INFJ의 직관적이고 감정적인 성향과 충돌할 수 있으며, 서로의 가치와 목표에서 큰 차이를 보일 수 있습니다.");
                break;
            case "INTJ":
                System.out.println("INTJ는 논리적이고 계획적인 성향을 가지고 있으며, ENFP는 창의적이고 열정적입니다.\n ENFP는 INTJ의 목표 달성에 필요한 창의적인 아이디어를 제공할 수 있고, INTJ는 ENFP의 아이디어를 구체적인 계획으로 발전시킬 수 있습니다. 서로의 강점을 보완하여 시너지 효과를 낼 수 있습니다.");
                break;
            case "ISTP ":
                System.out.println("ISTP는 독립적이고 문제 해결 능력이 뛰어나며, ESTP는 활기차고 현실적인 성향을 가지고 있습니다.\n 서로의 실용적인 접근 방식을 이해하고 존중할 수 있으며, 공동의 목표를 위해 협력할 수 있습니다. 함께 모험을 즐기고 실용적인 해결책을 찾을 수 있습니다.");
                break;
            case "ISFP":
                System.out.println("ISFP는 감성적이고 예술적인 성향을 가지고 있으며, ESFJ는 사교적이고 돌봄을 중요시합니다.\n ESFJ는 ISFP의 감정적 요구를 잘 이해하고 지지할 수 있으며, ISFP는 ESFJ의 사교적 성향을 즐기고 조화를 이루며 살아갈 수 있습니다.");
                break;
            case "INFP":
                System.out.println("INFP는 이상적이고 감성적인 성향을 가지고 있으며, ENFJ는 따뜻하고 사교적인 성향을 가지고 있습니다.\n ENFJ는 INFP의 감정적 요구를 잘 이해하고 지지할 수 있으며, INFP는 ENFJ의 사교적 성향을 존중하고 감정적으로 지지할 수 있습니다. 서로의 감정적 요구를 잘 충족시킬 수 있습니다.");
                break;
            case "INTP ":
                System.out.println("INTP는 논리적이고 분석적인 성향을 가지고 있으며, ENTJ는 조직적이고 목표 지향적인 성향을 가지고 있습니다.\n 서로의 지적 자극을 주고받으며 협력할 수 있으며, INTP는 ENTJ의 목표 달성에 필요한 창의적인 아이디어를 제공할 수 있습니다. ENTJ는 INTP의 논리적 분석을 실질적인 계획으로 구체화할 수 있습니다.");
                break;
            case "ESTP":
                System.out.println("ESTP는 활기차고 현실적인 성향을 가지고 있으며, ISTP는 독립적이고 문제 해결 능력이 뛰어납니다.\n서로의 실용적인 접근 방식을 이해하고 존중할 수 있으며, 공동의 목표를 위해 협력할 수 있습니다. 함께 모험을 즐기고 실용적인 해결책을 찾을 수 있습니다.");
                break;
            case "ESFP ":
                System.out.println("ESFP는 활기차고 사교적인 성향을 가지고 있으며, ISFJ는 세심하고 헌신적인 성향을 가지고 있습니다.\n 서로의 필요를 잘 이해하고 상호 보완적인 관계를 형성할 수 있습니다. ISFJ는 ESFP의 활력을 유지하는 데 도움을 줄 수 있고, ESFP는 ISFJ에게 더 많은 사회적 기회를 제공하여 삶을 더 즐겁게 만들 수 있습니다.");
                break;
            case "ENFP":
                System.out.println("ENFP는 창의적이고 열정적인 성향을 가지고 있으며, INTJ는 논리적이고 계획적인 성향을 가지고 있습니다.\n 서로의 강점을 보완하여 시너지 효과를 낼 수 있습니다. ENFP는 INTJ의 목표 달성에 필요한 창의적인 아이디어를 제공할 수 있고, INTJ는 ENFP의 아이디어를 구체적인 계획으로 발전시킬 수 있습니다.");
                break;
            case "ENTP":
                System.out.println("ENTP는 창의적이고 지적인 대화를 즐기며, INFJ는 깊이 있는 통찰력과 강한 직관력을 가지고 있습니다.\n 서로의 아이디어와 이상을 공유하며 지적 자극을 주고받을 수 있습니다. INFJ는 ENTP의 자유로운 사고를 존중하고, ENTP는 INFJ의 깊은 통찰력을 이해할 수 있습니다.");
                break;
            case "ESTJ":
                System.out.println("ESTJ는 조직적이고 목표 지향적인 성향을 가지고 있으며, ISFJ는 세심하고 헌신적인 성향을 가지고 있습니다.\n 서로의 필요를 잘 이해하고 상호 보완적인 관계를 형성할 수 있습니다. ESTJ는 ISFJ의 세심함과 헌신을 존중하고, ISFJ는 ESTJ의 리더십과 결단력을 존중할 수 있습니다.");
                break;
            case "ESFJ ":
                System.out.println("ESFJ는 사교적이고 돌봄을 중요시하는 성향을 가지고 있으며, ISFP는 감성적이고 예술적인 성향을 가지고 있습니다.\n 서로의 필요를 잘 이해하고 상호 보완적인 관계를 형성할 수 있습니다. ISFP는 ESFJ의 사교적 성향을 즐기고, ESFJ는 ISFP의 감정적 요구를 잘 이해하고 지지할 수 있습니다.");
                break;
            case "ENFJ":
                System.out.println("ENFJ는 따뜻하고 사교적인 성향을 가지고 있으며, INFP는 이상적이고 감성적인 성향을 가지고 있습니다.\n 서로의 감정적 요구를 잘 이해하고 지지할 수 있으며, ENFJ는 INFP의 감정적 요구를 잘 충족시킬 수 있습니다. INFP는 ENFJ의 사교적 성향을 존중하고 감정적으로 지지할 수 있습니다.");
                break;
            case "ENTJ":
                System.out.println("ENTJ와 INTP는 모두 사고와 직관을 선호하며, 지적 호기심과 논리적인 분석 능력을 공유합니다.\n INTP는 ENTJ의 비전을 실현하는 데 필요한 창의적이고 혁신적인 아이디어를 제공할 수 있으며, ENTJ는 INTP의 아이디어를 현실화하는 데 필요한 조직력과 실행력을 제공합니다.\n 서로의 강점을 보완하며, 함께 목표를 달성하는 과정에서 큰 시너지 효과를 낼 수 있습니다. INTP는 ENTJ의 리더십과 결단력을 존중하고, ENTJ는 INTP의 깊이 있는 분석과 문제 해결 능력을 높이 평가합니다.");
                break;



        }
        switch(worse) {
            case "ISTJ":
                System.out.println("ISTJ는 구조화된 환경과 명확한 계획을 선호하는 반면, ENFP는 자유롭고 유연한 환경을 선호합니다.\nENFP의 즉흥적이고 창의적인 성향은 ISTJ의 규칙적이고 계획적인 성향과 충돌할 수 있으며, 서로의 생활 방식과 가치관에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ISFJ":
                System.out.println("ISFJ는 안정적이고 예측 가능한 환경을 좋아하는 반면, ENTP는 새로운 아이디어와 변화를 추구합니다.\n ENTP의 논리적이고 비판적인 성향은 ISFJ의 감정적이고 조화로운 성향과 충돌할 수 있으며, 서로의 접근 방식과 우선순위에서 큰 차이를 보일 수 있습니다.");
                break;
            case "INFJ":
                System.out.println(" INFJ는 깊은 감정적 유대와 의미 있는 관계를 중요시하는 반면, ESTP는 실용적이고 즉각적인 경험을 선호합니다.\n ESTP의 현실적이고 행동 지향적인 성향은 INFJ의 직관적이고 감정적인 성향과 충돌할 수 있으며, 서로의 가치와 목표에서 큰 차이를 보일 수 있습니다.");
                break;
            case "INTJ":
                System.out.println(" INTJ는 장기적인 목표와 계획을 중요시하는 반면, ESFP는 즉흥적이고 현재를 즐기는 성향을 가지고 있습니다.\n ESFP의 즉각적인 만족과 즐거움을 추구하는 성향은 INTJ의 장기적인 계획과 전략과 충돌할 수 있으며, 서로의 생활 방식과 목표에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ISTP":
                System.out.println(" ISTP는 실용적이고 객관적인 성향을 가지고 있으며, INFJ는 감정적이고 직관적인 성향을 가지고 있습니다.\n INFJ의 깊은 감정적 요구와 직관적인 통찰력은 ISTP의 실용적이고 논리적인 성향과 충돌할 수 있으며, 서로의 접근 방식에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ISFP":
                System.out.println("ISFP는 감정적이고 자유로운 성향을 가지고 있으며, ENTJ는 목표 지향적이고 조직적인 성향을 가지고 있습니다.\n ENTJ의 강한 리더십과 논리적인 접근 방식은 ISFP의 감정적이고 예술적인 성향과 충돌할 수 있으며, 서로의 생활 방식과 목표에서 큰 차이를 보일 수 있습니다.");
                break;
            case "INFP":
                System.out.println("INFP는 자유롭고 창의적인 성향을 가지고 있으며, ESTJ는 조직적이고 구조적인 성향을 가지고 있습니다.\n ESTJ의 강한 리더십과 현실적인 접근 방식은 INFP의 이상적이고 감성적인 성향과 충돌할 수 있으며, 서로의 생활 방식과 목표에서 큰 차이를 보일 수 있습니다.");
                break;
            case "INTP ":
                System.out.println("INTP는 논리적이고 독립적인 성향을 가지고 있으며, ESFJ는 사교적이고 감정적인 성향을 가지고 있습니다.\n ESFJ의 감정적 요구와 사교적인 성향은 INTP의 논리적이고 독립적인 성향과 충돌할 수 있으며, 서로의 생활 방식과 우선순위에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ESTP":
                System.out.println("ESTP는 즉각적이고 실용적인 성향을 가지고 있으며, INFJ는 깊은 감정적 유대와 의미 있는 관계를 중요시합니다.\n INFJ의 깊은 감정적 요구와 직관적인 통찰력은 ESTP의 실용적이고 행동 지향적인 성향과 충돌할 수 있으며, 서로의 가치와 목표에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ESFP ":
                System.out.println("ESFP는 즉흥적이고 현재를 즐기는 성향을 가지고 있으며, INTJ는 장기적인 목표와 계획을 중요시합니다.\n INTJ의 전략적이고 계획적인 성향은 ESFP의 즉각적인 만족과 즐거움을 추구하는 성향과 충돌할 수 있으며, 서로의 생활 방식과 목표에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ENFP":
                System.out.println("ENFP는 자유롭고 유연한 환경을 선호하는 반면, ISTJ는 구조화된 환경과 명확한 계획을 선호합니다.\n ISTJ의 규칙적이고 계획적인 성향은 ENFP의 즉흥적이고 창의적인 성향과 충돌할 수 있으며, 서로의 생활 방식과 가치관에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ENTP":
                System.out.println("ENTP는 새로운 아이디어와 변화를 추구하며, ISFJ는 안정적이고 예측 가능한 환경을 좋아합니다.\n ENTP의 논리적이고 비판적인 성향은 ISFJ의 감정적이고 조화로운 성향과 충돌할 수 있으며, 서로의 접근 방식과 우선순위에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ESTJ":
                System.out.println(" ESTJ는 조직적이고 구조적인 성향을 가지고 있으며, INFP는 자유롭고 창의적인 성향을 가지고 있습니다.\n ESTJ의 강한 리더십과 현실적인 접근 방식은 INFP의 이상적이고 감성적인 성향과 충돌할 수 있으며, 서로의 생활 방식과 목표에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ESFJ":
                System.out.println(" ESFJ는 사교적이고 감정적인 성향을 가지고 있으며, INTP는 논리적이고 독립적인 성향을 가지고 있습니다.\n ESFJ의 감정적 요구와 사교적인 성향은 INTP의 논리적이고 독립적인 성향과 충돌할 수 있으며, 서로의 생활 방식과 우선순위에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ENFJ":
                System.out.println("ENFJ는 따뜻하고 사교적인 성향을 가지고 있으며, ISTP는 독립적이고 실용적인 성향을 가지고 있습니다.\n ENFJ의 감정적 요구와 사교적인 성향은 ISTP의 실용적이고 논리적인 성향과 충돌할 수 있으며, 서로의 생활 방식과 접근 방식에서 큰 차이를 보일 수 있습니다.");
                break;
            case "ENTJ":
                System.out.println("ENTJ는 목표 지향적이고 조직적인 성향을 가지고 있으며, ISFP는 자유롭고 감성적인 성향을 가지고 있습니다.\n ENTJ는 구조화된 계획과 효율성을 중시하는 반면, ISFP는 현재의 순간을 즐기고 즉흥적으로 행동하는 것을 선호합니다.\n 이러한 성향의 차이로 인해, ENTJ는 ISFP를 비효율적이거나 방향성이 부족하다고 느낄 수 있고, ISFP는 ENTJ를 지나치게 지배적이거나 엄격하다고 느낄 수 있습니다.\n 서로의 접근 방식과 우선순위에서 큰 차이를 보일 수 있으며, 이러한 차이가 갈등의 원인이 될 수 있습니다.");
                break;


        }


    }
}
