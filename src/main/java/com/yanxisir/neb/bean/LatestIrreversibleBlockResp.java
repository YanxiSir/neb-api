package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class LatestIrreversibleBlockResp implements Serializable {

    private String hash;
    @JSONField(name = "parent_hash")
    private String parentHash;
    private Integer height;
    private Integer nonce;
    private String coinbase;
    private Date timestamp;
    @JSONField(name = "chain_id")
    private Integer chainId;
    @JSONField(name = "state_root")
    private String stateRoot;
    @JSONField(name = "txs_root")
    private String txsRoot;
    @JSONField(name = "events_root")
    private String eventsRoot;
    private String miner;
    @JSONField(name = "is_finality")
    private Boolean isFinality;
    @JSONField(name = "consensus_root")
    private ConsensusRoot consensusRoot;
    private TransactionReceipt[] transactions;

    @Data
    public static class ConsensusRoot implements Serializable {

        private Date timestamp;
        private String proposer;
        @JSONField(name = "dynasty_root")
        private String dynastyRoot;
    }
}
