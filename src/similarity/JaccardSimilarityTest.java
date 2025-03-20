package similarity;

import java.util.Set;

public class JaccardSimilarityTest {

    public static void main(String[] args) {
        // 예시 String
        String D1 = "ABRACADABRA";
        String D2 = "BRICABRAC";

        // 2-shingles 생성
        Set<String> shingles1 = JaccardSimilarity.createKShingles(D1, 2);
        Set<String> shingles2 = JaccardSimilarity.createKShingles(D2, 2);

        // 출력
        System.out.println("Document1 shingles: " + shingles1);
        System.out.println("Document2 shingles: " + shingles2);

        // 자카드 유사도 계산 & 출력
        double similarity = JaccardSimilarity.calculate(shingles1, shingles2);
        System.out.println("Jaccard similarity Document1 and Document2: " + similarity);
    }
}
