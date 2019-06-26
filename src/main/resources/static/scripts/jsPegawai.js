var vDataPegawai = [
    {'Nama':'Fullan','Alamat':'Jl. Beo No.5', 'Jns':true,'Kota':'Bekasi','Email':'fullan@fullan.com'},
    {'Nama':'Fullmen','Alamat':'Jl. Anggrek No.20', 'Jns':true,'Kota':'Tanggerang','Email':'fullan@fullan.com'},
    {'Nama':'Fullen','Alamat':'Jl. Mawar No.35', 'Jns':false,'Kota':'Bandung','Email':'fullan@fullan.com'}
];
$(document).ready(function () {
    var vJahitHtml ='';

    $.each(vDataPegawai, function (index, data) {
        var vJns = '';
        if (data.Jns==true) {
            vJns = 'Laki - laki';
        } else {
            vJns = 'Perempuan';
        }
        vJahitHtml = vJahitHtml +   '<tr>'+
                                '<td>' +
                                    (index+1) +
                                '</td>' +
                                '<td>' +
                                    data.Nama +
                                '</td>' +
                                '<td>' +
                                    data.Alamat +
                                '</td>' +
                                '<td>' +
                                    vJns +
                                '</td>' +
                                '<td>' +
                                    data.Kota+
                                '</td>' +
                                '<td>' +
                                    data.Email+
                                '</td>' +
                                '<td>' +
                                    '<button class="btn btn-primary">Detail</button>'+
                                    '<button class="btn btn-warning" cl="clBtnEditPegawai>Edit</button>'+
                                    '<button class="btn btn-danger">Delete</button>'+
                                '</td>' +    
                            '</tr>';
    });
    // disini untuk append
            $('.clBtnEditPegawai').click(function () {
                $('#idMdlBodyEditPegawai').empty();
                var vData = JSON.parse($(this).attr('data'));
                var strHtml2='<form>' +
                          '<div class="form-group"> '+
                          '  <label for="Nama">Nama Pegawai</label> '+
                          '  <input type="text" class="form-control" id="idNamaPegawai" placeholder="Nama"> ' +
                          '</div> '+
                          '<div class="form-group"> '+
                      '      <label for="Alamat">Alamat</label> '+
                      '      <input type="text" class="form-control" id="idAlamatPegawai" placeholder="Alamat">'+
                      '    </div>'+
                     
                      
                      '    <button type="submit" class="btn btn-default">Submit</button>'+
                      '  </form>';
                      
                $('#idMdlBodyEditPegawai').append(strHtml2);
                $('#idNamaPegawai').val(vData.Nama);
                $('#idMdlEditPegawai').modal('show');
        })
});
