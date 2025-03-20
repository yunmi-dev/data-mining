package similarity;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    /// 두 집합의 Jaccard 유사도를 계산하는 메소드
    public static <T> double calculate(Set<T> set1, Set<T> set2) {

        // 두 집합이 모두 비어있으면 유사도는 1
        if (set1.isEmpty() && set2.isEmpty()) {
            return 1.0;
        }

        // 한 집합만 비어있으면 유사도는 0
        if (set1.isEmpty() || set2.isEmpty()) {
            return 0.0;
        }

        // 교집합 계산
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // 합집합 계산
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);

        // Jaccard Similarity = 교집합 크기 / 합집합 크기
        return (double) intersection.size() / union.size();
    }

    /// 문자열에서 k-shingles를 생성하는 메소드
    public static Set<String> createKShingles(String text, int k) {
        Set<String> shingles = new HashSet<>();

        // text가 null이거나 k보다 짧으면 빈 집합 리턴
        if (text == null || text.length() < k) {
            return shingles;
        }

        for (int i = 0; i <= text.length() - k; i++) {
            shingles.add(text.substring(i, i + k));
        }
        return shingles;
    }
}
