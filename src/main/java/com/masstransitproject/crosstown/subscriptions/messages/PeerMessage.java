package com.masstransitproject.crosstown.subscriptions.messages;

import java.io.Serializable;
import java.net.URI;
import java.util.UUID;

// Copyright 2007-2011 Chris Patterson, Dru Sellers, Travis Smith, et. al.
//  
// Licensed under the Apache License, Version 2.0 (the "License"); you may not use 
// this file except in compliance with the License. You may obtain a copy of the 
// License at 
// 
//     http://www.apache.org/licenses/LICENSE-2.0 
// 
// Unless required by applicable law or agreed to in writing, software distributed 
// under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
// CONDITIONS OF ANY KIND, either express or implied. See the License for the 
// specific language governing permissions and limitations under the License.

	public abstract class PeerMessage implements Serializable
	{
		private UUID peerId;
		private URI peerUri;
		private long timestamp;
		public UUID getPeerId() {
			return peerId;
		}
		public void setPeerId(UUID peerId) {
			this.peerId = peerId;
		}
		public URI getPeerUri() {
			return peerUri;
		}
		public void setPeerUri(URI peerUri) {
			this.peerUri = peerUri;
		}
		public long getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}
		
	}
