package br.com.alura.forum.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("forum")
public class ForumApiProperty {
	
	private String originPermitida = "http://www.forum-api.com.br";
	
	private final Seguranca seguranca = new Seguranca();
	
	public Seguranca getSeguranca() {
		return seguranca;
	}
	
	public String getOriginPermitida() {
		return originPermitida;
	}

	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}

	public static class Seguranca {
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
		 
	}
}
