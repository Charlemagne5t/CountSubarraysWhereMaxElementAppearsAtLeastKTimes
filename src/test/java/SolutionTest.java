import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] nums = {1,3,2,3,3};
        int k = 2;
        long expected = 6;
        long actual = new Solution().countSubarrays(nums, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] nums = {1,4,2,1};
        int k = 3;
        long expected = 0;
        long actual = new Solution().countSubarrays(nums, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] nums = {61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82};
        int k = 2;
        long expected = 224;
        long actual = new Solution().countSubarrays(nums, k);

        Assert.assertEquals(expected, actual);
    }
}

