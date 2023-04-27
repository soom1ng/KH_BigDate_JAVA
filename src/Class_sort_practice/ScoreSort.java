package Class_sort_practice;

import java.util.Comparator;

// 학생의 성적이 높은 순으로 결과를 표시하고, 성적이 같으면 학번 순으로 정렬
public class ScoreSort implements Comparator<Score> {

    @Override
    public int compare(Score o1, Score o2) {
        if (o1.score == o2.score) {
            return o1.stdID.compareTo(o2.stdID); // 성적이 같은 경우 학번 순 정렬
        }
        return o2.score - o1.score;
    }
}
