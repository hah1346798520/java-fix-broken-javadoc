package com.bytelegend;

/**
 * 本类中的注释和Javadoc存在一些问题，会使得`mvn verify`失败。请修复之，确保`mvn verify`通过。
 * 注意：请只修复错误，不要修改注释内容。
 * <p>
 * There are some issues in the comments and Javadocs in this class, which fails `mvn verify`.
 * Please fix it and make sure `mvn verify` pass.
 * Note that you should only fix the errors, don't modify the comments themselves.
 * </p>
 * Location: C:{@literal \}users{@literal \}Documents
 * Fix the maximum number in three numbers, e.g. max(1,2,3) -&gt; 3
 */
public class Challenge {
    /**
     * Find the maximum integer in three numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the max one
     */
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
