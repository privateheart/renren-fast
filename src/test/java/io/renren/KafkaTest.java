package io.renren;

import io.renren.common.utils.RedisUtils;
import io.renren.common.utils.Sender;
import io.renren.modules.sys.entity.SysUserEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaTest {
	@Autowired
	private Sender sender;

	@Test
	public void contextLoads() {
		sender.sendMessage("hy1",0,"1","hy1 message1!!");
		sender.sendMessage("hy1",0,"1","hy1 第二条消息");
		sender.sendMessage("hy2",0,"1","hy2 message1!!");
		sender.sendMessage("hy2",0,"1","hy2 second message");
	}

}
