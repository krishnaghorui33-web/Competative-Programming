public static int hasPairWithDifference(int[] A, int N, int B) {

    Arrays.sort(A);

    int i = 0;
    int j = 1;

    while (i < N && j < N) {

        if (i == j) {
            j++;
            continue;
        }

        int diff = Math.abs(A[j] - A[i]);

        if (diff == B) {
            return 1;
        } else if (diff < B) {
            j++;
        } else {
            i++;
        }
    }

    return 0;
}