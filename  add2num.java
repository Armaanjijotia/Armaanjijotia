class add2num {

    int val;
    add2num next;

    // constructor
    add2num(int val) {
        this.val = val;
        this.next = null;
    }

    public static add2num addTwoNumbers(add2num l1, add2num l2) {

        add2num dummy = new add2num(0);
        add2num current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = carry;

            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            current.next = new add2num(digit);
            current = current.next;
        }

        if (carry != 0) {
            current.next = new add2num(carry);
        }

        return dummy.next;
    }
}
