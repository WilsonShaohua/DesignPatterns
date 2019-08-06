package create.singleton.demo1;

public class Client {

	public static void main(String[] args) {
		LoadBalancer balancer1,balancer2,balancer3,balancer4;
		balancer1 = XMLUtil.getBean();
		balancer2 = LoadBalancer.getInstancer();
		balancer3 = LoadBalancer.getInstancer();
		balancer4 = LoadBalancer.getInstancer();
		
		if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("服务器负载均衡器具有唯一性\n");
		}else {
			System.out.println("服务器负载均衡器不具有唯一性\n");
		}		
			
		for(int i=0;i<100;i++) {
			String server = balancer1.getServer();
			System.out.println("分发请求至服务器：" + server);
		}
	}

}
