package leet

object FindMedianSortedArrays:
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double =
    val merged = (nums1 ++ nums2).sorted
    if merged.length % 2 == 0 then (merged(merged.length / 2 - 1) + merged(merged.length / 2)).toDouble / 2
    else merged(merged.length / 2).toDouble
