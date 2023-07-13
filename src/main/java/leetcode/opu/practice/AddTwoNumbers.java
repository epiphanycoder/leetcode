package leetcode.opu.practice;


public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        // [2,4,3], [5,6,4]
        // obj.addTowNumbers(new ListNode(), new ListNode());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int v1 = l1 != null ? l1.val: 0;
            int v2 = l2 != null ? l2.val: 0;

            int sum = v1 + v2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;

            if(l1 != null) {
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(carry > 0) {
            cur.next = new ListNode(carry);
        }

        return ans.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}