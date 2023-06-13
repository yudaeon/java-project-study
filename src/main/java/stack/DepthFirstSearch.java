package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 깊이 우선 탐색
public class DepthFirstSearch {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 첫 입력은 정점의 갯수
        int maxNodes = Integer.parseInt(reader.readLine());
        // 정점간 연결 정보
        int[][] edgeMap = new int[maxNodes + 1][maxNodes + 1];

        // 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
        String[] edges = reader.readLine().split(" ");
        // 두개씩 순회
        for (int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]);  // 0, 2, 4, ...
            int rightNode = Integer.parseInt(edges[i * 2 + 1]);  // 1, 3, 5, ...
            edgeMap[leftNode][rightNode] = 1;
            edgeMap[rightNode][leftNode] = 1;
        }

        // 다음에 방문할 점들을 담아두는 스택
        Stack<Integer> toVisit = new Stack<>();
        // 방문을 기록하는 용도의 배열
        boolean[] visited = new boolean[maxNodes + 1];
        // 여기부터 DFS

        // 첫 방문 대상 선정 (1)
        int next = 1;
        // 대상을 스택에 push
        toVisit.push(next);
        // 스택이 빌때까지 반복하는 while
        while (!toVisit.empty()) {
            // TODO 다음 방문할 곳을 가져온다. (pop)

            // TODO 이미 방문했다면 다음곳으로 간다. (pop)

            // TODO 방문했다 표시한다.

            // TODO 요부분은 문제에 따라 다르다.

            // TODO 다음 방문 대상을 검색해서, 스택에 푸시 한다.
            for(;;) { // TODO 그래프에 존재하는 정점들을 순회
                // TODO 해당 정점에 도달할 수 있고, 아직 방문하지 않았다면
                // TODO 다음에 방문할 곳으로 스택에 푸시
            }
        }

        // TODO 답을 출력한다.
    }

    public static void main(String[] args) throws IOException {
        new DepthFirstSearch().solution();
    }
}