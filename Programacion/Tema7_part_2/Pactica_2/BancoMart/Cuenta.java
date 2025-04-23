package Programacion.Tema7_part_2.Pactica_2.BancoMart;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cuenta {
    private UUID id;
    private  Cliente propietario;
    private Double saldo;
    private List<Transaccion> transacciones;

    public Cuenta(Cliente propietario) {
        this.propietario = propietario;
        this.transacciones = new ArrayList<>();
        this.id = UUID.randomUUID();
        this.saldo = 0.0;
    }

    public UUID getId() {
        return id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{ ");
        sb.append(id).append(" } - {");
        sb.append(propietario.getDni()).append(" } --");
        sb.append("Saldo: ").append(saldo).append("}€ ");

        return sb.toString();
    }
    public void add(Transaccion t) {
        this.transacciones.add(t);
        if (t.getTipo().equals(TipoTransaccion.INGRESO)){
            this.saldo = getSaldo() + t.getImporte();
        } else if (t.getTipo().equals(TipoTransaccion.GASTO)) {
            this.saldo = getSaldo() - t.getImporte();
        }
    }
}
