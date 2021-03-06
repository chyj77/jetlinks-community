package org.jetlinks.community.notify.rule;

import lombok.Getter;
import lombok.Setter;
import org.jetlinks.community.notify.DefaultNotifyType;
import org.jetlinks.rule.engine.api.model.NodeType;
import org.jetlinks.rule.engine.executor.node.RuleNodeConfig;
import org.springframework.util.Assert;

@Getter
@Setter
public class RuleNotifierProperties implements RuleNodeConfig {

    private DefaultNotifyType notifyType;

    private String notifierId;

    private String templateId;

    @Override
    public NodeType getNodeType() {
        return NodeType.PEEK;
    }

    @Override
    public void setNodeType(NodeType nodeType) {

    }

    @Override
    public void validate() {
        Assert.notNull(notifyType,"notifyType can not be null");
        Assert.hasText(notifierId,"notifierId can not be empty");
        Assert.hasText(templateId,"templateId can not be empty");

    }
}
