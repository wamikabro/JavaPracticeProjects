public class LogicalEquationValidation {
    public static void main(String[] args) {
        // Tell if the statement q and p are true or false.
        System.out.println("Our Equation is: (q -> ~p) <-> (p <-> q)");

        boolean q;
        boolean p;

        // let's run loops to control q and p, for different conditions
        // condition 1: q = true, p = true
        // condition 2: q = true, p = false
        // condition 3: q = false, p = true
        // condition 4: q = false, p = false

        // but loops will be working from 1 to 0 ( so true comes first, then false)
        // 0 = false, 1 = true. But we will set this inside loops using if statement
        for(int i = 1; i>=0; i--) {

            // defining q
            if(i == 1)
                q = true;
            else
                q = false;

            for (int j = 1; j >= 0; j--) {
                // defining p
                if(j == 1)
                    p = true;
                else
                    p = false;

                /*
                according to our equation, we need to find a few thing to find the
                truth table of whole equation.
                since we already have p and q, using that, we will find
                1. ~p, 2. q -> ~p, and then 3. p <-> q, and then whole equation
                (q -> ~p) <-> (p <-> q)
                Since every thing that we mentioned is the part of our equation.
                */

                // ~p (Invert of p / Not p)
                boolean notP;
                if (p)
                    notP = false;
                else
                    notP = true;

                // q -> ~p
                // since we already have the answer of ~p,
                // we will only imply q with that answer
                boolean qImpliesNotP;
                // Note: if 1st operand is false, the answer is always true logically,
                // that's why
                if (!q)
                    qImpliesNotP = true;
                    // else, if q is true, then the answer will be same as 2nd operand
                    // if second operand (which in our case is notP) is true,
                    // then the answer of implies will also be true, or otherwise.
                else
                    qImpliesNotP = notP;

                // Now we need to find last chunk before finding whole equation
                // p <-> q
                boolean pBiconditionalQ;
                // simply, it means when p and q both are either true or false,
                // the answer will be true. otherwise if both are different,
                // the answer is false.
                // that is XNOR (Exclusive Not Or) gate.
                if (!(p ^ q)) // this is implementation of XNOR
                    pBiconditionalQ = true;
                else
                    pBiconditionalQ = false;

                // Time to find final answer to equation, since we've all the building blocks

                boolean wholeEquation;
                // (q -> ~p) <-> (p <-> q)
                // we already have q -> ~p, and p <-> q.
                // We only need to do biconditional between those 2 answers
                // qImpliesNotP <-> pBiconditionalQ
                // Same XNOR gate will be used again.
                if (!(qImpliesNotP ^ pBiconditionalQ))
                    wholeEquation = true;
                else
                    wholeEquation = false;

                System.out.println("answer: " + wholeEquation);
            }
        }
    }
}
