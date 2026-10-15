class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        //List<List<Integer>> result = new List<>();
        Set<List<Integer>> result = new HashSet<>();
        subset(nums, 0, new ArrayList(), result);
        
        List<List<Integer>> myList = result.stream()
                           .collect(Collectors.toList());
        return myList;
    }

    public void subset (int[] arr, int index, List<Integer> temp, Set<List<Integer>> result) {
        if (index == arr.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(arr[index]);
        subset(arr, index+1, temp, result);
        temp.remove(temp.size()-1);
        subset(arr, index+1, temp, result);
    }
}
