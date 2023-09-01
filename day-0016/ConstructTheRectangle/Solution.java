class Solution {
    public int[] constructRectangle(int area) {
        for (var i = (int) Math.sqrt(area); i > 0; i--)
		if (i * (area / i) == area)
			return new int[]{area / i, i};
	return null;
    }
}