package com.xin.spring.annotation.chapter29.listener;

import com.xin.spring.annotation.chapter29.event.MyApplicationEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author XYF
 * @date 2025-12-25 19:38
 */

@Component
public class MyApplicationEventListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void afterCommit(MyApplicationEvent event){
        System.out.println("事务已经提交===>>>" + event.getSource().toString());
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void afterRollback(MyApplicationEvent event){
        System.out.println("事务已经回滚===>>>" + event.getSource().toString());
    }


}
