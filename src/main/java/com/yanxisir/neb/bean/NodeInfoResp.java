package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Data
public class NodeInfoResp implements Serializable {

    /**
     * the node id
     */
    private Integer id;

    @JSONField(name = "chain_id")
    private Integer chainId;

    private String coinbase;

    /**
     * Number of peers currenly connected.
     */
    @JSONField(name = "peer_count")
    private Integer peerCount;

    /**
     * the node synchronized status.
     */
    @JSONField(name = "synchronized")
    private Boolean synced;

    /**
     * the node route table bucket size.
     */
    @JSONField(name = "bucket_size")
    private Integer bucketSize;

    @JSONField(name = "protocol_version")
    private String protocolVersion;

    @JSONField(name = "route_table")
    private List<RouteTable> routeTables;

    @Data
    public static class RouteTable {
        private Integer id;
        private List<String> address;
    }
}
