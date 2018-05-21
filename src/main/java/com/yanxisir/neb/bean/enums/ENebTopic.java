package com.yanxisir.neb.bean.enums;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
public enum ENebTopic {

    /**
     * The topic of pending a transaction in transaction_pool.
     */
    PENDING_TX("chain.pendingTransaction"),

    /**
     * The topic of updating latest irreversible block.
     */

    LIB_BLOCK("chain.latestIrreversibleBlock"),
    /**
     * The topic of executing & submitting tx.
     */
    TX_RESULT("chain.transactionResult"),

    /**
     * The topic of setting new tail block.
     */
    NEW_TAIL_BLOCK("chain.newTailBlock"),

    /**
     * The topic of reverting block.
     */
    REVERT_BLOCK("chain.revertBlock");

    private String value;

    ENebTopic(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
