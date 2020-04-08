import $ from 'jquery';
import 'materialize-css';
import Dropzone from 'dropzone';
import React from 'react';
import ReactDOM from 'react-dom';

Dropzone.options.filedropzone = {
  paramName: 'file',
  maxFilesize: 2,
  dictDefaultMessage: "",
  thumbnailHeight: 200,
  thumbnailWidth: 200,
  init: function(){
    this.on("addedfile", function(file){
      $("#overlaytext").val($("#overlaytext-shown").val());
      $("#overlaytextsize").val($("#overlaytextsize-shown").val());
    });
  },
  accept: function(file, done){
    done();
    $(".dz-details").remove();
    $(".dz-progress").remove();
    $(".dz-error-message").remove();
    $(".dz-success-mark").remove();
    $(".dz-error-mark").remove();
  }
};

$(function(){
  $('.button-collapse').sideNav();
});