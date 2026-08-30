class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public void sub(int i, int[] arr, ArrayList<Integer> li) {

        res.add(new ArrayList<>(li));

        // li --> []

        for (int j = i; j < arr.length; j++) {

            li.add(arr[j]);

            sub(j + 1, arr, li);

            li.remove(li.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        sub(0, nums, new ArrayList<>());

        return res;
    }
}