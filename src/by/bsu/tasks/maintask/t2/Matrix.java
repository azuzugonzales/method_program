package by.bsu.tasks.maintask.t2;

class Matrix {
    private int[][] Cost;

    public Matrix(int vertices) {
        Cost = new int[vertices][vertices];
    }

    public void setEdge(int i, int j, int weight) {
        Cost[i][j] = weight;
    }

    public int getCost(int i, int j) {
        if (i == j) {
            return 0;
        }

        if (Cost[i][j] == 0) {
            return 10001;
        }
        return Cost[i][j];
    }

    protected int cheapest(Integer[] result, boolean[] visited) {
        int best = -1;
        for (int i = 0; i < Cost.length; i++) {
            if (!visited[i] && ((best < 0) || (result[i] < result[best]))) {
                best = i;
            }
        }
        return best;
    }

    public Integer[] distancesFrom(int source) {
        Integer[] result = new Integer[Cost.length];
        java.util.Arrays.fill(result, 10001);
        result[source] = source;
        boolean[] visited = new boolean[Cost.length];
        for (int i = 0; i < Cost.length; i++) {
            int City = cheapest(result, visited);
            visited[City] = true;
            for (int j = 0; j < Cost.length; j++) {
                result[j] = Math.min(result[j], result[City] + getCost(City, j));
            }
        }
        return result;
    }
}