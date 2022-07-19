public class solution {

    public long[] solution(int x, int n) {

        // 입력받은 n은 갯수이니 배열의 크기로 설정해준다.
        long[] answer = new long[n];

        // for문을 사용하여 배열의 자릿수만큼 반복한다.
        for (int i = 0; i < n; i++){

            // answer 배열의 0번 인덱스부터 (i + 1) * x; 대입
            answer[i] = (long) (i + 1) * x;
        }
        return answer;
    }
}
