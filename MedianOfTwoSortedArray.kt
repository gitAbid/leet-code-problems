fun mergeSorted(nums1: IntArray, nums2: IntArray): IntArray {
    var c1 = nums1.size
    var c2 = nums2.size
    val merged = IntArray(c1 + c2)
    var index = 0
    var c1Index = 0
    var c2Index = 0
    while (c1 != 0 && c2 != 0) {
        when {
            nums1[c1Index] > nums2[c2Index] -> {
                merged[index] = nums2[c2Index++]
                c2--
            }

            else -> {
                merged[index] = nums1[c1Index++]
                c1--
            }
        }
        index++
    }
    while (c1 != 0) {
        merged[index] = nums1[c1Index++]
        index++
        c1--;
    }
    while (c2 != 0) {
        merged[index] = nums2[c2Index++]
        index++
        c2--;
    }

    return merged
}


fun median(nums: IntArray): Double {
    val mid = nums.size / 2
    return if (nums.size % 2 == 0) {
        (nums[mid] + nums[mid - 1]) / 2.0
    } else {
        nums[mid].toDouble()
    }
}

fun main(args: Array<String>) {
    val nums1 = intArrayOf(1,2,2,2,2,2,2)
    val nums2 = intArrayOf(3,4)

//merge in log(n+m) time
    val sorted = mergeSorted(nums1, nums2)
    val median = median(sorted)
    println(median)
}

//q: adding git origin to a new project