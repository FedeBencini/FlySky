package CaC.Grupo2.FlySky.service;

import CaC.Grupo2.FlySky.dto.PagoDto;
import CaC.Grupo2.FlySky.dto.ReservaDto;
import CaC.Grupo2.FlySky.dto.RespReservaDto;
import CaC.Grupo2.FlySky.dto.VueloDto;
import CaC.Grupo2.FlySky.entity.Pago.TipoPago;

import java.text.ParseException;
import java.util.List;

public interface IFlyService {

    List<VueloDto> buscarTodosVuelos();

    RespReservaDto reservarVuelo(ReservaDto reservaDto) throws ParseException;

   // List<ReservaDto> buscarTodasReservas();

    String pagarReserva(PagoDto pagoDto);
}
