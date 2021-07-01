class MedianFinder {

    ArrayList<Integer> list; 
    /** initialize your data structure here. */
    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {
        Collections.sort(list);
        
        if(list.size() % 2 == 0) {
            double median = (double) (list.get(list.size()/2 - 1) + list.get(list.size()/2))/2;
            return median;
        } else return (double) list.get(list.size() / 2);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */