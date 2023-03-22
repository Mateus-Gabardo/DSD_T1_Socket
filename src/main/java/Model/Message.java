package Model;

public class Message {
    private Pessoa pessoa;
    private Jogador jogador;
    private TimeFutebol time;
    private String metodo;
    private String tipo;

    public Message() {
    }

    public Message(Pessoa pessoa, TimeFutebol time, String metodo) {
            super();
            this.pessoa = pessoa;
            this.time = time;
            this.metodo = metodo;
    }

    public boolean isExistsTime() {
            if(time != null) {
                    return true;
            }
            return false;
    }

    public boolean isExistsJogador() {
//            if(pessoa != null) {
//                    Class<?> obj = pessoa.getClass();
//                    if(obj.equals(Jogador.class)) {
//                            return true;
//                    }
//            }
            if(jogador != null) {
                    return true;
            }
            return false;
    }

    public boolean isExistsTecnico() {
            if(pessoa != null) {
                    Class<?> obj = pessoa.getClass();
                    if(obj.equals(Tecnico.class)) {
                            return true;
                    }
            }
            return false;
    }

    public String getMetodo() {
            return metodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
	
    public Pessoa getPessoa() {
            return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
            this.pessoa = pessoa;
    }

    public TimeFutebol getTime() {
            return time;
    }

    public void setTime(TimeFutebol time) {
            this.time = time;
    }

    public void setMetodo(String metodo) {
            this.metodo = metodo;
    }

    public TipoMetodo getTipoMetodo(){
            switch (metodo) {
            case "GET": {
                    return TipoMetodo.GET;
            }
            case "INSERT": {
                    return TipoMetodo.INSERT;
            }
            case "UPDATE": {
                    return TipoMetodo.UPDATE;
            }
            case "DELETE": {
                    return TipoMetodo.DELETE;
            }
            case "LIST": {
                    return TipoMetodo.LIST;
            }
            default:
                    return null;
            }
    }
}
